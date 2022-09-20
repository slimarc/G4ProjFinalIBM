package br.com.hellobank.api.models.response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.hellobank.api.models.entidades.Deposito;
import br.com.hellobank.api.models.entidades.Saque;
import br.com.hellobank.api.models.entidades.Transacao;
import br.com.hellobank.api.models.entidades.Transferencia;
import br.com.hellobank.api.models.enums.TipoTransferencia;


public class TransferenciasResponse {

    private List<Transacao> transacoes = new ArrayList();
    public TransferenciasResponse() {
    }

    private List<Transferencia> transferenciaList; 
    private List<Deposito> depositoList;
    private List<Saque> saqueList;
    private Long contaId;

    public TransferenciasResponse(Long contaId, List<Transferencia> transferenciaList, List<Deposito> depositoList, List<Saque>saqueList){
        this.transferenciaList = transferenciaList;
        this.depositoList = depositoList;
        this.saqueList = saqueList;
        this.contaId = contaId;
        loadList();
    }

    private void loadList() {
        for (Transferencia transferencia : transferenciaList) {
            if(contaId.equals(transferencia.getContaIdSaida())) {
                transacoes.add(new Transacao(TipoTransferencia.TRANSFERENCIA,transferencia.getContaIdRecebe(),
                        transferencia.getData(),
                        transferencia.getValor()));
            }
            else {
                transacoes.add(new Transacao(transferencia.getContaIdSaida(),
                        transferencia.getData(),
                        transferencia.getValor(),
                        TipoTransferencia.TRANSFERENCIA));
            }
        }

        for(Deposito deposito : depositoList) {
            transacoes.add(new Transacao(deposito.getData(),
                    deposito.getValor(),
                    TipoTransferencia.DEPOSITO));
        }

        for(Saque saque : saqueList) {
            transacoes.add(new Transacao(saque.getData(),
                    saque.getValor(),
                    TipoTransferencia.SAQUE));
        }

        Collections.sort(transacoes, new Comparator<Transacao>() {
            @Override
            public int compare(Transacao tansacao1, Transacao transacao2)
            {

                return  tansacao1.getData().compareTo(transacao2.getData());
            }
        });
    }

    public List getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List transacoes) {
        this.transacoes = transacoes;
    }
}
