package br.com.hellobank.api.models.entidades;

import br.com.hellobank.api.models.request.TransferenciaRequest;
import br.com.hellobank.api.util.DateHour;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Transferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long contaIdSaida;
	private Long contaIdRecebe;
    private LocalDateTime data;

    @Min(value = 0l)
    private double valor;

	public Transferencia(){}
	
	public Transferencia(TransferenciaRequest transferenciaRequest) {
		this.contaIdSaida = transferenciaRequest.getSaidaContaId();
		this.contaIdRecebe = transferenciaRequest.getRecebeContaId();
		this.valor = transferenciaRequest.getValor();
		this.data = LocalDateTime.now();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getContaIdSaida() {
		return contaIdSaida;
	}
	
	public void setContaIdSaida(Long contaIdSaida) {
		this.contaIdSaida = contaIdSaida;
	}
	
	public Long getContaIdRecebe() {
		return contaIdRecebe;
	}
	
	public void setContaIdRecebe(Long contaIdRecebe) {
		this.contaIdRecebe = contaIdRecebe;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getData() {
		return DateHour.format(data);
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Transferencia{" +
				"id=" + id +
				", contaIdSaida=" + contaIdSaida +
				", contaIdRecebe=" + contaIdRecebe +
				", data=" + data +
				", valor=" + valor +
				'}';
	}
}
