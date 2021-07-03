function validateForm(){
    var ValorNominal = document.getElementById("ValorNominal").value;
    var TasaEfectivaAnual = document.getElementById("TasaEfectivaAnual").value;
    var Retencion = document.getElementById("valorRetencion").value;
    var TotalCostoGastoI = document.getElementById("CostoGastoInicial").value;
    var TotalCostoGastoF = document.getElementById("CostoGastoFinal").value;

    var FrecCapitalizacion = document.getElementById("frecuenciaC").value;
    var TipoMoneda = document.getElementById("selectTipoMoneda").value;
    var TipoTasa = document.getElementById("selectTipoTasa").value;
    var TipoAño = document.getElementById("selectTipoAño").value;
    var TipoPlazo = document.getElementById("selectTipoPlazo").value;




    if(ValorNominal == "" || ValorNominal == null){
        document.getElementById("eValorNominal").innerHTML = 'Ingrese el Valor Nominal';
    }else{
        document.getElementById("eValorNominal").innerHTML = '';
    }

    if(TasaEfectivaAnual == "" || TasaEfectivaAnual == null){
        document.getElementById("eTasaEfectivaAnual").innerHTML = 'Ingrese la Tasa Efectiva';
    }else{
        document.getElementById("eTasaEfectivaAnual").innerHTML = '';
    }
    if(Retencion == "" || Retencion == null){
        document.getElementById("eValorRetencion").innerHTML = 'Ingrese la Retención';
    }else{
        document.getElementById("eValorRetencion").innerHTML = '';
    }
    if(TotalCostoGastoF == "" || TotalCostoGastoF == null){
        document.getElementById("eCostoGastoFinal").innerHTML = 'Ingrese el Costo/Gasto Final'
    }else{
        document.getElementById("eCostoGastoFinal").innerHTML = ''
    }
    if(TotalCostoGastoI == "" || TotalCostoGastoI == null){
        document.getElementById("eCostoGastoInicial").innerHTML = 'Ingrese el Costo/Gasto Inicial'
    }else{
        document.getElementById("eCostoGastoInicial").innerHTML = ''
    }



    if(TipoTasa == 0 || TipoTasa == null){
        document.getElementById("eTipoTasa").innerHTML = 'Ingrese el Tipo de Tasa'
    }else{
        document.getElementById("eTipoTasa").innerHTML = ''
    }

    if(TipoMoneda == 0 || TipoMoneda == null){
        document.getElementById("eTipoMoneda").innerHTML = 'Ingrese el Tipo de Moneda'
    }else{
        document.getElementById("eTipoMoneda").innerHTML = ''
    }

    if(TipoAño == 0 || TipoAño == null){
        document.getElementById("eTipoAño").innerHTML = 'Ingrese los Dias por Año'
    }else{
        document.getElementById("eTipoAño").innerHTML = ''
    }

    if(TipoPlazo == 0 || TipoPlazo == null){
        document.getElementById("eTipoPlazo").innerHTML = 'Ingrese el Plazo de Tasa'
    }
    else{
        document.getElementById("eTipoPlazo").innerHTML = ''
    }

    return false;
}