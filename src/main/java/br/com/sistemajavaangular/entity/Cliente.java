package br.com.sistemajavaangular.entity;

import br.com.sistemajavaangular.converter.RiscoEnumConverter;
import br.com.sistemajavaangular.enums.RiscoEnum;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TA_CLIENTE")
public class Cliente {

    private static final long serialVersionUID = 8709929794662562231L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "NOME_CLIENTE")
    private String nomeCliente;

    @Column(name = "LIMITE_CREDITO")
    private Double limiteCredito;

    @Convert(converter = RiscoEnumConverter.class)
    @Column(name = "RISCO")
    private RiscoEnum risco;

    @Column(name = "TAXA_JUROS")
    private String taxaJuros;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public RiscoEnum getRisco() {
        return risco;
    }

    public void setRisco(RiscoEnum risco) {
        this.risco = risco;
    }

    public String getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(String taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(idCliente, cliente.idCliente)
                && Objects.equals(nomeCliente, cliente.nomeCliente)
                && Objects.equals(limiteCredito, cliente.limiteCredito)
                && Objects.equals(risco, cliente.risco)
                && Objects.equals(taxaJuros, cliente.taxaJuros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nomeCliente, limiteCredito, risco, taxaJuros);
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "idCliente=" + idCliente
                + ", nomeCliente='" + nomeCliente + '\''
                + ", limiteCredito=" + limiteCredito
                + ", risco='" + risco + '\''
                + ", taxaJuros='" + taxaJuros + '\''
                + '}';
    }
}
