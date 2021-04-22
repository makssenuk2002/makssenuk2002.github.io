let inputUsdFirBtc = document.getElementById('usdForBtc'),
    inputBtcFromRub = document.getElementById('btcFromUsd'),

    inputBtcForUsd = document.getElementById('btcForUsd'),
    inputRubFronUsd = document.getElementById('usdFromBtc'),

    inputDogeForUsd = document.getElementById('dogeForUsd'),
    inputUsdFromDoge = document.getElementById('usdFromDoge');
    

inputUsdFirBtc.addEventListener('input', function() {
    let request = new XMLHttpRequest();
    //request.open(method , url , async , login , pass);
    request.open('GET', 'current.json');
    request.setRequestHeader('Content-type', ' application/json; charset=utf-8');
    request.send();

    //status
    //statusText
    //responseText / response
    //readyState
    request.addEventListener('readystatechange', function () {
        if (request.readyState === 4 && request.status == 200) {
            let data = JSON.parse(request.response);
            inputBtcFromRub.value = (inputUsdFirBtc.value / data.btc).toFixed(7) + ' USD';
        } else {
            inputBtcFromRub.value = "sadasd";
        }
    })
})


inputBtcForUsd.addEventListener('input', () => {
    let request = new XMLHttpRequest();

    //request.open(method , url , async , login , pass);
    request.open('GET', 'current.json');
    request.setRequestHeader('Content-type', ' application/json; charset=utf-8');
    request.send();


    
    request.addEventListener('readystatechange', function () {
        if (request.readyState === 4 && request.status == 200) {
            let data = JSON.parse(request.response);
            inputRubFronUsd.value = (inputBtcForUsd.value * data.btc).toFixed(3) + ' USD';
        } else {
            inputRubFronUsd.value = "Всё хуйня , давай по новой!!";
        }
    })
})

inputDogeForUsd.addEventListener('input', () => {
    let request = new XMLHttpRequest();

    //request.open(method , url , async , login , pass);
    request.open('GET', 'current.json');
    request.setRequestHeader('Content-type', ' application/json; charset=utf-8');
    request.send();



    request.addEventListener('readystatechange', function () {
        if (request.readyState === 4 && request.status == 200) {
            let data = JSON.parse(request.response);
            inputUsdFromDoge.value = (   inputDogeForUsd.value * data.doge).toFixed(3) + ' USD';
        } else {
            inputUsdFromDoge.value = "Всё хуйня , давай по новой!!";
        }
    })
})