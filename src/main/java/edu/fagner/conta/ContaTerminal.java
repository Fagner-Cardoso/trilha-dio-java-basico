/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.fagner.conta;

import java.util.Scanner;

/**
 *
 * @author fagner-cardoso
 */
public class ContaTerminal {

    public static void main(String[] args) {

         // criar uma istância da classe Scanner e atribui a variavel userInput 
    Scanner userInput = new Scanner(System.in);

    System.out.println("Por favor, digite o número da conta: ");
    int numeroDaConta = userInput.nextInt(); 


    System.out.println("Por favor, digite o número da agência: ");
    String agencia = userInput.next();

    System.out.println("Por favor, digite o nome do cliente: ");
    String nomeDoCliente = userInput.next(); 

    System.out.println("Por favor, digite o valor do saldo: ");
    double saldo = userInput.nextDouble();

    imprimirMensagemNovoCliente(numeroDaConta, agencia, nomeDoCliente, saldo);

    }


static void imprimirMensagemNovoCliente(int numeroDaConta, String agencia, String nomeDoCliente, double saldo){
    String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, sua conta %d e seu saldo %.2f já está disponível para saque.", nomeDoCliente, agencia, numeroDaConta, saldo); 
    System.out.println(mensagem); 
}   

}
