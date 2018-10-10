//**********************************************************************
// Copyright (c) 2018 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************
package com.fitec;

import java.util.ArrayList;

public class Troco
{
    ArrayList<TrocoNotas> trocoNotas = new ArrayList<>();
    ArrayList<TrocoMoedas> trocoMoedas = new ArrayList<>();

    public void addTrocoMoeda(int quantidadeMoeda, double valorMoeda)
    {
        TrocoMoedas trocoMoeda = new TrocoMoedas();
        trocoMoeda.setQuantidadeMoeda(quantidadeMoeda);
        trocoMoeda.setValorMoeda(valorMoeda);
    }

    public void addTrocoNotas(int quantidadeMoeda, double valorMoeda)
    {
        TrocoNotas trocoNota = new TrocoNotas();
        trocoNota.setQuantidadeNota(quantidadeMoeda);
        trocoNota.setValorNota(valorMoeda);
    }

}
