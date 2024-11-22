class Modal{
    constructor(width, height, type, content, callback) {
        this.width = width;
        this.height = height;
        this.type = type;
        this.content = content;
        if(typeof callback === 'function'){
            callback(this);
        }
    }
    open() {
        let div = document.createElement('div');
        div.classList.add('bg-gray');
        let html = '';

        switch(this.type){
        case 'alert':
            html += '<div class="modal-wrap" style="height:'+this.height+'px; width:'+this.width+'px;">';
            html += '<div class="modal-header"><p>알림</p></div>';
            html += '<div class="modal-body"><p>'+this.content+'</p></div>';
            html += '<div class="modal-footer"><button id="closeModal" class="btn_alert_close">확인</button></div>';

            break;
        case 'login':
            html += '<div class="modal-wrap" style="height:'+this.height+'px; width: '+this.width+'px;">';
            html += '<div class="modal-header"><span id="closeModal" class="btn_login_close">X</span></div>';
            html += '<div class="modal-body login-modal-body"><image id="kLogin" class="dir_login" src="/static/img/k_login_btn.png"/> <image id="nLogin" src="/static/img/k_login_btn.png"/></div>';

            break;
        case 'confirm':
            html += '<div class="modal-wrap" style="height:'+this.height+'px; width: '+this.width+'px;">';
            html += '<div class="modal-header"><p>알림</p></div>';
            html += '<div class="modal-body"><p>'+this.content+'</p></div>';
            html += '<div class="modal-footer"><button class="btn-confirm btn-confirm-suc">확인</button><button id="closeModal" class="btn-confirm btn_modal_close">확인</button></div>';

            break;
        }
        html += '</div>'
        div.innerHTML = html;
        document.body.append(div);

        document.getElementById('closeModal')?.addEventListener('click', Modal.close);
    }

    static close() {
        $('.bg-gray').remove();
    }
}

$(document).ready(function(){
    $('#enter').on('click', function(){
        new Modal(450, 200, 'login', 'test').open();
    });
})