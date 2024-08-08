$(document).ready(function () {
    $("#menu-icon").click(function () {
        $(this).toggleClass("is-active");
        ($(this).hasClass("is-active")) ? sideNav.open() : sideNav.close();
    });
});

var sideNav = {
    open: function () {
        $('#sideBarWrap').css("width", "250px");
        $('#contentBody').css('margin-left', '250px');
    },
    close: function() {
        $('#sideBarWrap').css("width", "0");
        $('#contentBody').css('margin-left', '0');
    }
};