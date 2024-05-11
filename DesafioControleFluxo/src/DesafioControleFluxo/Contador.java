package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Informe o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Informe o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        try{
            contar(parametroUm, parametroDois);
        }catch(parametrosInvalidosException e){
            System.out.println("[ERRO]- O segundo parâmetro deve ser maior que o Primeiro!");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws parametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new parametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; ++i) {
                System.out.println("Imprimindo o número: "+ i );
            }
        }
    }
    public static class parametrosInvalidosException extends Exception{
    }

}