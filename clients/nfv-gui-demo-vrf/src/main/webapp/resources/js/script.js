/*
 * OpenNaaS script
 */

/**
 * Javascript for menu
 */
$(function() {
	$("#_menu").menu();
});

/**
 * Javascript for tabs
 */
$(function() {
	$("#tabs").tabs();
});


/**
 * Javascript for link confirm
 */
$(document).ready(function() {

        $("#jsonTable").tablesorter(); 

        $(".deleteButton").live("click", function () {
            $(this).parent().parent().remove();
        });

        $('th').click(function() {
            $("#jsonTable th").css('backgroundColor', '#c3d9ff');
            $("#jsonTable th").css('color', 'black');
            $(this).css('backgroundColor', 'rgb(5, 110, 207)');
            $(this).css('color', 'rgb(255, 255, 255)');
        });

	$("#dialog").dialog({
		autoOpen : false,
		modal : true,
		bgiframe : true,
		width : 300,
		height : 150,
		resizable : false,
		draggable : false
	});

	$(".link_confirm").click(function(e) {
		e.preventDefault();
		var theHREF = $(this).attr("href");
		$("#dialog").dialog('option', 'buttons', {
			"Confirm" : function() {
				$("#pleaseWait").dialog("open");
				window.location.href = theHREF;
			},
			"Cancel" : function() {
				$(this).dialog("close");
			}
		});
		$("#dialog").dialog("open");
	});

	$(".button_confirm").click(function(e) {
		e.preventDefault();
		var $form = $(this).closest('form');
		var action = $(this).attr("formaction");
		$form.attr("action", action);
		$("#dialog").dialog('option', 'buttons', {
			"Confirm" : function() {
				$("#pleaseWait").dialog("open");
				$form.submit();
			},
			"Cancel" : function() {
				$(this).dialog("close");
			}
		});
		$("#dialog").dialog("open");
	});
});

/**
 * GUI create and update view
 */
$(function() {
	
	/* Buttons */

        $("#changeMode").button();
        $("#manualType").button();
        $("#submitUpdateConfig").button();
        $("#defaultValues").button();
        $(".addRouteButton").button();
        $(".addCtrlInfoButton").button();
        $(".deleteButton").button();        

	$("#button1").button();
	$("#button2").button();
	$("#button3").button();
	$("#button4").button();
	$("#button5").button();
	$("#button6").button();
	$("#button7").button();
	$("#button8").button();
	$("#button9").button();
	$("#button10").button();
	$("#button11").button();
	$("#button12").button();
	$("#submitButton").button();

	$("#selectTemplateButton").button();
	$("#updateIpButton").button();
	$("#waitingButton").button({
		icons : {
			primary : 'ui-icon-newwin'
		}
	});
	$("#button6").click(function(event) {
		event.preventDefault();
	});
	$("#homeButton").button({
		icons : {
			primary : 'ui-icon-home'
		}
	});
	$("#logoutButton").button({
		icons : {
			secondary : 'ui-icon-power'
		}
	});
	$("#submitLogin").button({
		icons : {
			primary : 'ui-icon-triangle-1-e'
		}
	});

	/**
	 * Firewall table
	 */
	$("#fwRemove1").button();
	$("#fwRemove1").click(function(event) {
		event.preventDefault();
	});

	$("#fwRemove2").button();
	$("#fwRemove2").click(function(event) {
		event.preventDefault();
	});

	$("#fwRemove3").button();
	$("#fwRemove3").click(function(event) {
		event.preventDefault();
	});

	$("#fwAdd").button();
	$("#fwAdd").click(function(event) {
		event.preventDefault();
	});

	/**
	 * Waiting dialog
	 */
	// Link to open the dialog
	$("#submitButton").click(function(event) {
		$("#pleaseWait").dialog("open");
	});

	$("#updateIpButton").click(function(event) {
		$("#pleaseWait").dialog("open");
	});

	$("#pleaseWait").dialog({
		modal : true,
		autoOpen : false,
		width : 400,
		resizable : false,
		draggable : false,
		closeOnEscape : false,
		open : function() {
			$('.ui-widget-overlay').hide().fadeIn();
			$(".ui-dialog-titlebar-close", $(this).parent()).hide();
		},
		show : "fade",
		hide : "fade"
	});

	/**
	 * Language selection
	 */
	$("#languages").buttonset({
		icons : {
			primary : "ui-icon-flag"
		}
	});
	// English
	$("#english").click(function(event) {
		open: window.open("/opennaas-vcpe/secure/vcpeNetwork/home?locale=en_gb", "_self");
	});
	        
	$("#radioset").buttonset();
	$("#radioset2").buttonset();
	
	
	/**
	 * Template selection
	 */	
	$("#selectable").selectable();
	$("#selectTemplateButton").click(function(event) {	
		if ($('#selectable .ui-selected').attr('id') != undefined) {
			if ($('#selectable .ui-selected').attr('id') == 'sp_vcpe') {
				url = "/opennaas-vcpe/secure/noc/vcpeNetwork/singleProvider/physical?templateType=" + $('#selectable .ui-selected').attr('id');
			} else {
				url = "/opennaas-vcpe/secure/noc/vcpeNetwork/multipleProvider/physical?templateType=" + $('#selectable .ui-selected').attr('id');				
			}
			open: window.open(url, "_self");
		}
		else {
			$("#noTemplate").dialog('option', 'buttons', {			
				"Go back" : function() {
					$(this).dialog("close");
				}
			});
			$(".ui-dialog-titlebar-close").hide();
			$("#noTemplate").dialog("open");
		}
	});	
	
	$("#noTemplate").dialog({
		autoOpen : false,
		modal : true,
		bgiframe : true,
		width : 300,
		height : 200,
		resizable : false,
		draggable : false
	});
	
});

// Read a page's GET URL variables and return them as an associative array.
$.extend({
	getUrlVars : function() {
		var vars = [], hash;
		var hashes = window.location.href.slice(
				window.location.href.indexOf('?') + 1).split('&');
		for ( var i = 0; i < hashes.length; i++) {
			hash = hashes[i].split('=');
			vars.push(hash[0]);
			vars[hash[0]] = hash[1];
		}
		return vars;
	},
	getUrlVar : function(name) {
		return $.getUrlVars()[name];
	}
});

$(document).ready(function() {
	// only apply when create view or update IPs view are loaded
	if($("#spLogicalForm").length || $("#updateIPs").length || $("#mpLogicalForm").length) {
		// apply firewall table style
		$("#firewallTable").styleTable();
		// get submit button
		var button = null;
		if($("#spLogicalForm").length || $("#mpLogicalForm").length) {
			button = $("#submitButton");
		} else if($("#updateIPs").length) {
			button = $("#updateIpButton");
		}

		// predefined style on BoD div
		$("#bod").css('zIndex', 100);

		// ============ begin custom validators ==================== //
		// regex
		$.validator.addMethod("custom_regex", function(value, element,	regexp) {
			return this.optional(element) || regexp.test(value);
		});
		// ============ end custom validators ==================== //

	}
});