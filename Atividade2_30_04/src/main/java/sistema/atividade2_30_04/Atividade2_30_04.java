/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistema.atividade2_30_04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gilson
 */
public class Atividade2_30_04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        
        
        System.out.println("Cadastro de Clientes");
        while (true) {
            System.out.print("Digite o código do cliente: ");
            int codigo = scanner.nextInt();
            if (codigo == -1) {
                break;
            }
            scanner.nextLine(); 
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a data de nascimento do cliente (DD/MM/AAAA): ");
            String dataNascimento = scanner.nextLine();
            System.out.print("Digite o cpf cliente: ");
            String cpf = scanner.nextLine();

            Cliente cliente = new Cliente(codigo, nome, dataNascimento, cpf);
            listaClientes.add(cliente);
        }

        
        

        
        System.out.print("Digite o código do cliente a ser pesquisado: ");
        int codigoPesquisa = scanner.nextInt();

        
        boolean encontrado= false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getCodigo() == codigoPesquisa) {
                System.out.println("Cliente encontrado:");
                System.out.println("Código: " + cliente.getCodigo());
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
                System.out.println("CPF: " + cliente.getCpf());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente não encontrado.");
        }

        scanner.close();
    
    }
}
