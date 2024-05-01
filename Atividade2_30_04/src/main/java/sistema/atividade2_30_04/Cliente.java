/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.atividade2_30_04;

/**
 *
 * @author Gilson
 */
public class Cliente {
    
    private int codigo;
    private String nome;
    private String dtNasc;
    private String cpf;

    public Cliente(int codigo, String nome, String dtNas, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dtNasc;
    }

    public String getCpf() {
        return cpf;
    }

    
    public int compareTo(Cliente outroCliente) {
        return Integer.compare(this.codigo, outroCliente.getCodigo());
    }
    
}
