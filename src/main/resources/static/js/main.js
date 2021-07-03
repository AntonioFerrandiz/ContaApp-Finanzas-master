(function () {
    console.log("Hello World!");
})();


function NumDias() {
    var FechaVencimiento = new Date(document.getElementById('FechaVencimientoID').value);
    var FechaDescuento = new Date(document.getElementById('FechaDescuentoID').value);
    var ndias = parseInt((FechaVencimiento - FechaDescuento) / (24 * 3600 * 1000));
    if (document.getElementById("FechaVencimientoID")) {
        return ndias;
    }
}

var CostoGastoInicialArr = [];

function CostoGastoInicial() {
    var CostoGastoI = document.getElementById("CostoGastoInicial").value;
    if (!CostoGastoI) {
        CostoGastoInicialArr.push(0);
    } else {
        document.getElementById('textareainiciales').append(CostoGastoI + ' + ');
        CostoGastoInicialArr.push(parseFloat(CostoGastoI));
        var TotalCostoGastoI = 0;
        CostoGastoInicialArr.forEach(function (CostoGastoInicialArr) {
            TotalCostoGastoI += CostoGastoInicialArr;
        });
    }
    document.getElementById('CostoGastoInicial').value = '';
    return TotalCostoGastoI;
}

var CostoGastoFinalArr = [];

function CostoGastoFinal() {
    var CostoGastoF = document.getElementById("CostoGastoFinal").value;

    if (!CostoGastoF) {
        CostoGastoFinalArr.push(0);
    } else {
        document.getElementById('textareafinales').append(CostoGastoF + ' + ');
        CostoGastoFinalArr.push(parseFloat(CostoGastoF));
        var TotalCostoGastoF = 0;
        CostoGastoFinalArr.forEach(function (CostoGastoFinalArr) {
            TotalCostoGastoF += CostoGastoFinalArr;
        });
    }
    document.getElementById('CostoGastoFinal').value = '';
    return TotalCostoGastoF;
}

function Calcular() {
//, document.getElementById('textoCGF').innerHTML ='Costo/Gasto Final agregado.'
    //, document.getElementById('textoCGI').innerHTML ='Costo/Gasto Inicial agregado.'
    //COSTOS/GASTOS
    var TotalCostoGastoI = document.getElementById("CostoGastoInicial").value;
    document.getElementById('CostoGastoInicial').value = '';
    var TotalCostoGastoF = document.getElementById("CostoGastoFinal").value;
    document.getElementById('CostoGastoFinal').value = '';

    //TIPO DE MONEDA $ o S/.
    var select = document.getElementById('selectTipoMoneda');
    var TipoMoneda = select.options[select.selectedIndex].text;
    console.log(TipoMoneda);

    //TIPO DE TASA
    var selectTT = document.getElementById('selectTipoTasa');
    var TipoTasa = selectTT.options[selectTT.selectedIndex].text;
    console.log(TipoTasa);
    if (TipoTasa === 'Efectiva' || TipoTasa === '-') {
        document.getElementById("frecuenciaC").disabled = true;
    } else {
        document.getElementById("frecuenciaC").disabled = false;
    }

    //FRECUENCIA CAPITALIZACION
    var FrecCapitalizacion = document.getElementById("frecuenciaC").value;
    console.log(FrecCapitalizacion);

    //NÚMERO DE DIAS ENTRE DOS FECHAS
    var DiferenciaDias = NumDias();
    console.log(DiferenciaDias);

    //TASA EFECTIVA
    var TasaEfectivaAnual = document.getElementById("TasaEfectivaAnual").value;

    //PLAZO DE TASA
    var TipoPlaza = document.getElementById("selectTipoPlazo").value;

    //CONVERSION DE TASA EFECTIVA A TASA EFECTIVA ANUAL
    if (TipoTasa === 'Efectiva') {
        if (TipoPlaza == 1) {
            console.log('Diario');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual / 100), (360 / 1)) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 2) {
            console.log('Quincenal');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual / 100), (24 / 1)) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 3) {
            console.log('Mensual');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual / 100), (12 / 1)) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 4) {
            console.log('Bimestral');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual / 100), (6 / 1)) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 5) {
            console.log('Trimestral');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual / 100), (4 / 1)) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 6) {
            console.log('Cuatrimestral');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual / 100), (3 / 1)) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 7) {
            console.log('Semestral');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual / 100), (2 / 1)) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 8) {
            console.log('Anual');
            TasaEfectivaAnual = TasaEfectivaAnual * 1;
            console.log(TasaEfectivaAnual);
        }
    }
    //CONVERSION DE TASA NOMINAL A EFECTIVA ANUAL
    else if (TipoTasa === 'Nominal') {
        if (TipoPlaza == 1) {
            console.log('Diario');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual * 360) / (100 * FrecCapitalizacion), FrecCapitalizacion / 1) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 2) {
            console.log('Quincenal');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual * 24) / (100 * FrecCapitalizacion), FrecCapitalizacion / 1) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 3) {
            console.log('Mensual');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual * 12) / (100 * FrecCapitalizacion), FrecCapitalizacion / 1) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 4) {
            console.log('Bimestral');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual * 6) / (100 * FrecCapitalizacion), FrecCapitalizacion / 1) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 5) {
            console.log('Trimestral');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual * 4) / (100 * FrecCapitalizacion), FrecCapitalizacion / 1) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 6) {
            console.log('Cuatrimestral');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual * 3) / (100 * FrecCapitalizacion), FrecCapitalizacion / 1) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 7) {
            console.log('Semestral');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual * 2) / (100 * FrecCapitalizacion), FrecCapitalizacion / 1) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        } else if (TipoPlaza == 8) {
            console.log('Anual');
            TasaEfectivaAnual = (100 * (Math.pow(1 + (TasaEfectivaAnual * 1) / (100 * FrecCapitalizacion), FrecCapitalizacion / 1) - 1)).toFixed(8);
            console.log(TasaEfectivaAnual);
        }
    }
    //RESULTADO DE CONVERSION
    console.log('TEA: ' + TasaEfectivaAnual);

    //VALOR NOMINAL
    var ValorNominal = document.getElementById("ValorNominal").value;

    //DIAS POR AÑO
    var DiasAño = 0;
    var r = document.getElementById("selectTipoAño").value;
    if (r == 1) DiasAño = 360;
    else if (r == 2) DiasAño = 365;
    console.log(DiasAño);


    //CALCULO DE LA TASA DESCONTADA
    var TE = (Math.pow((1 + (TasaEfectivaAnual / 100)), (DiferenciaDias / DiasAño)) - 1);
    console.log('TE: ' + TE * 100);

    //CALCULO DE D
    var d = ((TE) / ((TE) + 1));
    console.log('d: ' + d * 100);

    //CALCULO DEL DESCUENTO
    var Descuento = ValorNominal * d;
    console.log('Descuento: ' + Descuento);

    //CALCULO DEL VALOR NETO
    var ValorNeto = ValorNominal - Descuento;
    console.log('ValorNeto: ', ValorNeto);

    //RESULTADO DE LOS COSTOS/GASTOS
    console.log('CostoGastoInicial: ' + TotalCostoGastoI);
    console.log('CostoGastoFinal: ' + TotalCostoGastoF);

    //CALCULO DE LA RETENCIÓN
    var Retencion = document.getElementById("valorRetencion").value;
    var TotalRetencion = parseFloat((Retencion / 100 * ValorNominal));
    console.log('Retencion', TotalRetencion);

    //CALCULO DEL VALOR RECIBIDO
    var ValorRecibido = ValorNeto - parseFloat(TotalCostoGastoI) - TotalRetencion;
    console.log("ValorRecibido", ValorRecibido);

    //CALCULO DEL VALOR ENTREGADO
    var ValorEntregado = parseInt(ValorNominal) + parseFloat(TotalCostoGastoF) - TotalRetencion;
    console.log("ValorEntregado:", ValorEntregado);

    //CALCULO DE LA TCEA
    var TCEA = (Math.pow((ValorEntregado / ValorRecibido), (DiasAño / DiferenciaDias)) - 1);

    //RESULTADOS FINALES
    document.getElementById("vtrds").innerHTML = /* -n-  -->*/ `${TipoMoneda} ` + ValorRecibido.toFixed(2);
    document.getElementById("tceads").innerHTML = TCEA * 100 + '%';
}

