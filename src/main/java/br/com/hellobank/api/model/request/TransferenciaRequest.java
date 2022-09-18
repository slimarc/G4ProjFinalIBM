package br.com.hellobank.api.model.request;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Transferencia")
public class Transferencia {

	@Column(name = "contaId", length = 45, nullable = false, unique = true)
	private Integer contaId;	
	
	@Column(name = "valor", length = 45, nullable = false, unique = true)
	private double  valor;
		
	@Column(name = "data", length = 45, nullable = false, unique = true)
	private LocalDateTime data;
}

public class TransferenciaRequest {

	@NotBlank(message = "Para qual conta vai ser transferido o dinheiro?")
    private Integer contaId;

    
    @NotBlank(message = "O campo deve ser informado")
    @Min(1)
    private double valor;

    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public TransferenciaRequest(
            @JsonProperty("contaId") Integer contaId,
            @JsonProperty("valor") double valor) {
        this.contaId = contaId;
        this.valor = valor;
    }

    public Integer getContaId() {
        return contaId;
    }

    public void setContaId(Integer contaId) {
        this.contaId = contaId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "SaqueRequest{" +
                "contaId=" + contaId +
                ", valor=" + valor +
                '}';
    }
}
