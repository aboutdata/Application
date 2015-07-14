/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
 2  * Compute time from the date past in till now.
 3  * @param {int} milliseconds of the start date
 4  * @returns {String} formatted time
 5  */
function timeTillNow(ms) {
    var date = new Date(parseInt(ms));
    var now = new Date();
    var gap = (now.valueOf() - date.valueOf()) / 1000;
    var day = parseInt(gap / 60 / 60 / 24);
    if (day > 0)
        return day + "天前";
    else {
        var hours = parseInt(gap / 60 / 60);
        if (hours > 0)
            return hours + "小时前";
        else {
            var mins = parseInt(gap / 60);
            if (mins > 0)
                return mins + "分钟前";
            else {
                return "刚刚";
            }
        }
    }
}
/**
 * add ajax loading to <a data-toggle="modal" href="path/to/ajax"...></a>
 */
function addClickHandler() {
    $("a[data-toggle=modal]").click(function () {
        var target = $(this).attr('data-target');
        var url = $(this).attr('href');
        $(target).load(url, function () {
            //$("input, select, textarea").not("[type=submit]").jqBootstrapValidation();
        });
    });
}
/**
 * add confirm function to <a confirm="confirm something"...></a>
 */
function addConfirmFunc() {
    $('a[confirm]').on('click', function (evt) {
        if (!confirm($(this).attr('confirm'))) {
            return false;
        } else {
            return true;
        }
    });
}

/**
 * Format loan duration
 * @param {string} duration
 * @returns {*年零*个月零*天}
 */
function formatDuration(duration) {
    return duration.replace('零0个月零', '零').replace('0年零', '').replace('零0天', '');
}

function formatTime(time) {
    if (time == null || isNaN(time))
        return null;
    var date = new Date(time);
    return date.toLocaleDateString();
}

// 对Date的扩展，将 Date 转化为指定格式的String 
// 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符， 
// 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字) 
// 例子： 
// (new Date()).Format("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423 
// (new Date()).Format("yyyy-M-d h:m:s.S")      ==> 2006-7-2 8:9:4.18 
Date.prototype.Format = function (fmt)
{
    var o = {
        "M+": this.getMonth() + 1, //月份 
        "d+": this.getDate(), //日 
        "h+": this.getHours(), //小时 
        "m+": this.getMinutes(), //分 
        "s+": this.getSeconds(), //秒 
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
        "S": this.getMilliseconds()             //毫秒 
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

$(function () {
    /**
     * binding events.
     */
    addClickHandler();
    addConfirmFunc();

    $(".super-loading").hide();
});


