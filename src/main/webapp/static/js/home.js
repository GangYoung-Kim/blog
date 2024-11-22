$(document).ready(function(){
    wrapLetters();
})

function wrapLetters() {
    const kakaoText = document.getElementById('animatedKakaoText');
    const kakao = kakaoText.textContent;
    kakaoText.textContent = '';

    [...kakao].forEach((char, i) => {
        if (char === ' ') {
            const space = document.createElement('span');
            space.className = 'space';
            kakaoText.appendChild(space);
        } else {
            const span = document.createElement('span');
            span.textContent = char;
            span.style.transitionDelay = i*0.1+'s';
            kakaoText.appendChild(span);
        }
    });

    const naverText = document.getElementById('animatedNaverText');
    const naver = naverText.textContent;
    naverText.textContent = '';

    [...naver].forEach((char, i) => {
        if (char === ' ') {
            const space = document.createElement('span');
            space.className = 'space';
            naverText.appendChild(space);
        } else {
            const span = document.createElement('span');
            span.textContent = char;
            span.style.transitionDelay = i*0.1+'s';
            naverText.appendChild(span);
        }
    });

    const guestText = document.getElementById('animatedGuestText');
    const guest = guestText.textContent;
    guestText.textContent = '';

    [...guest].forEach((char, i) => {
        if (char === ' ') {
            const space = document.createElement('span');
            space.className = 'space';
            guestText.appendChild(space);
        } else {
            const span = document.createElement('span');
            span.textContent = char;
            span.style.transitionDelay = i*0.1+'s';
            guestText.appendChild(span);
        }
    });
}

$('#kLogin').on('click', function(){
    $.ajax({
        url:'/req/kakaoLogin',
        type:'GET',
        success:function(res){
            console.log('SUCC',res);
        }
    })
})