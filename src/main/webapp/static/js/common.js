$(document).ready(function () {
    $("#menu-icon").click(function () {
        $(this).toggleClass("is-active");
        ($(this).hasClass("is-active")) ? sideNav.open() : sideNav.close();
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