class ContaOperacoes {
static int Op; 
static double valor;
double saldo;   



public boolean  sacar (){
    if (valor > saldo || valor <= 0){
        return false;
    }
    else{
        return true;
    }
}



boolean depositar(){
    if (valor <=0 ) {
        return false;
    }
    else{
        saldo+=valor;
        return true;
    }
}


void ConsultarSaldo(){
    System.out.printf("Saldo disponível:%s.2fR$",saldo);
}
}