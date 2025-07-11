package br.com.carlosbrito.util;

import java.util.InputMismatchException;

/**
 * @author carlos.brito
 * Criado em: 08/07/2025
 */
public class DocumentoUtil {
    public static boolean validarCPF(String cpf){
        try{
            String cpfFormatado = cpf.replaceAll("\\D","");

            if(cpfFormatado.length() != 11 || cpfFormatado.matches("(\\d)\\1{10}")){
                return false;
            }

            int soma = 0;

            for(int i = 0; i < 9; i++){
                soma+= Character.getNumericValue(cpfFormatado.charAt(i)) * (10 - i);
            }

            int digito1 = 11 - (soma%11);
            if(digito1 > 9){
                digito1 = 0;
            }

            soma = 0;
            for(int i = 0; i < 10; i++){
                soma+= Character.getNumericValue(cpfFormatado.charAt(i)) * (11 - i);
            }
            int digito2 = 11 - (soma%11);
            if(digito2 > 9){
                digito2 = 0;
            }

            return (Character.getNumericValue(cpfFormatado.charAt(9)) == digito1
                    && Character.getNumericValue(cpfFormatado.charAt(10)) == digito2);

        }catch (NumberFormatException e){
            System.out.println("Erro ao realizar a conversão de texto -> número. CPF incorreto.");
        }catch (Exception e){
            System.out.println("OPS! Erro inesperado: " + e.getLocalizedMessage());
        }

        return false;
    }

    public static boolean validarCNPJ(String cnpj){

        try{
            String cnpjFormatado = cnpj.replaceAll("\\D","");

            if(cnpjFormatado.length() != 14 || cnpjFormatado.matches("(\\d)\\1{13}")){
                return false;
            }

            int[] peso1 = {5,4,3,2,9,8,7,6,5,4,3,2};
            int soma = 0;
            for(int i = 0; i < 12; i++){
                soma = Character.getNumericValue(cnpjFormatado.charAt(i)) * peso1[i];
            }
            int digito1 = 11 - (soma%11);
            if(digito1 > 9 ){digito1 = 0;}

            int[] peso2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};
            soma = 0;
            for(int i = 0; i < 13; i++){
                soma = Character.getNumericValue(cnpjFormatado.charAt(i)) * peso2[i];
            }
            int digito2 = 11 - (soma%11);
            if(digito2 > 9){digito2 = 0;}

            return (Character.getNumericValue(cnpjFormatado.charAt(12)) == digito1
                && Character.getNumericValue(cnpjFormatado.charAt(13)) ==digito2);


        }catch(InputMismatchException e){
            System.out.println("ERRO: " + e.getLocalizedMessage());
        }
        return false;
    }
}
