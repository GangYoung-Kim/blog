$(document).ready(function () {
    $("#menu-icon").click(function () {
        $(this).toggleClass("is-active");
        ($(this).hasClass("is-active")) ? sideNav.open() : sideNav.close();
    });

    $('#contentBody').click(function () {
        modal.open('alert', '테스트입니다.');
    });
});

var sideNav = {
    open: function () {
        $('#sideBarWrap').css("width", "250px");
        setTimeout(function(){
             $('#contentBody').css('margin-left', '250px');
         }, 200)
        $('#contentBody').css('margin-left', '250px');
    },
    close: function() {
        $('#sideBarWrap').css("width", "0");
        setTimeout(function(){
            $('#contentBody').css('margin-left', '0');
        }, 300)
    }
};

var modal = {
   open: function(type, content, param){
       var cont  = $('.full-container');
       cont.append("<div class='bg-gray'></div>");

       var html = "<div class='modal-wrap'>";
       html += "<div class='modal-header'><p>알림</p></div>"
       html += "<div class='modal-body'><p>"+content+"</p></div>"

       if(type === 'alert'){
           html += "<div class='modal-footer'><button id='alertClose' class='btn-close-alert'>확인</button></div>"
       } else if(type === 'confirm') {
           html += "<div class='modal-footer'><button id='confirmSubmit' class='btn-submit-confirm'>확인</button> <button id='confirmClose' class='btn-cancel-confirm'>취소</button></div>"
       }
       html += "</div>";

       cont.append(html);

       $('#alertClose, #confirmClose').click(function () {
           modal.close();
       });

       $('#confirmSubmit').click(function () {
           var param = {
            1:1
           };
          modal.submit('POST', 'test', param);
       });
   },
   close: function(){
        $('.bg-gray').remove();
        $('.modal-wrap').remove();
   },
    submit: function(type, url, param){
       $.ajax({
           type:type,
           url:url,
           data:JSON.stringify(param),
           success:function(){

           }
       })
    }
}
