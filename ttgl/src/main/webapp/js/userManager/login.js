
Ext.application({
    name   : 'loginApp',

    launch : function() {
    	var form = Ext.create('Ext.form.Panel', {
    	    renderTo: Ext.get('form'),
    	    title: '用户登陆',
    	    height: 150,
    	    width: 300,
    	    bodyPadding: 10,
    	    defaultType: 'textfield',
    	    buttonAlign:'center',
    	    items: [
    	        {
    	            fieldLabel: '用户名',
    	            name: 'name',
    	            allowBlank:false,
    	            blankText:'用户名不能为空',
    	            maxLength:10,
    	            maxLengthText:'用户名最长长度为10'
    	        },
    	        {
    	        	id : 'newPwd',
    	            fieldLabel: '密码',
    	            inputType : 'password',
    	            allowBlank:false,
    	            blankText:'密码不能为空',
    	            vtype:'alphanum',
    	            alphanumText:'密码必须为字母或数字',
    	            maxLength:15,
    	            maxLengthText:'密码最长长度为15',
    	            name: 'password'
    	        }
    	       
    	    ],
    	    buttons:[{
    	    	text:'注册',
    	    	handler:function(){
    	    		window.location.href = '/ttgl/userManager/addUser.jsp';
    	    	}
    	    },{
    	    	text:'登陆',
    	    	handler:function(){
    	    		form.getForm().submit({
    	    			url:'/ttgl/userController/login.do',
    	    			success:function(form,action){
    	    				if (action.result && action.result.success == true) {  
    	    		            window.location.href = '/ttgl/userController/main.do';
    	    		            }
    	    			},
    	    			failure:function(form,action){
    	    				 switch (action.failureType) {
    	    		            case Ext.form.action.Action.CLIENT_INVALID:
    	    		                Ext.Msg.alert('提示信息', '填写的数据未通过验证');
    	    		                break;
    	    		            case Ext.form.action.Action.CONNECT_FAILURE:
    	    		                Ext.Msg.alert('提示信息', '连接服务器失败');
    	    		                break;
    	    		            case Ext.form.action.Action.SERVER_INVALID:
    	    		               Ext.Msg.alert('提示信息', action.result.msg);
    	    		       }
    	    			}
    	    		});
    	    	}
    	    }]
    	});
    }
});

