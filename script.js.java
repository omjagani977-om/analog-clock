let hr = document.geteElementById('hour');
let min = document.geteElementById('min');
let sec = document.geteElementById('sec');

function displayTime() {
    let data = new Data();

    // getting hour, min, sec from date
    let hh = date.getHour();
    let mm = date.getMinutes();
    let ss = date.getSeconds();

    let hRotation = 30*hh + m/2;
    let mRotation = 6*mm;
    let sRotation = 6*ss;

    hr.style.transform = 'rotate(${hRotation}deg)';
    min.style.transform = 'rotate(${mRotation}deg)';
    sec.style.transform = 'rotate(${sRotation}deg)';

    
}

setInterval(displayTime, 1000);
