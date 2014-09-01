 Ext.apply(Ext.form.VTypes, {
                password : function(val, field) {
                    if (field.initialPassField) {
                        var pwd = Ext.getCmp(field.initialPassField);
                        return (val == pwd.getValue());
                    }
                    return true;
                },
                passwordText : '两次输入的密码不一致!'
            });

Ext.application({
    name   : 'addUserApp',

    launch : function() {
    	var form = Ext.create('Ext.form.Panel', {
    	    renderTo: Ext.get('form'),
    	    title: '用户注册',
    	    height: 250,
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
    	        },
    	        {
    	            fieldLabel: '确认密码',
    	            inputType : 'password',
    	            allowBlank:false,
    	            blankText:'确认密码不能为空',
    	            initialPassField : 'newPwd',
    	            vtype:'password'
    	        },
    	        {
    	        	xtype      : 'fieldcontainer',
    	            fieldLabel : '性别',
    	            defaultType: 'radiofield',
    	            defaults: {
    	                flex: 1
    	            },
    	            layout: 'hbox',
    	            items: [
    	                    {
    	                        boxLabel  : '男',
    	                        name      : 'sex',
    	                        inputValue: '男',
    	                        checked: true
    	                    }, {
    	                        boxLabel  : '女',
    	                        name      : 'sex',
    	                        inputValue: '女'
    	                    }
    	                ]
    	        },{
    	        	fieldLabel: '邮箱',
    	            name: 'mail',
    	            vtype: 'email' 
    	        },{
    	        	xtype: 'hiddenfield',
    	            name: 'role',
    	            value: 1 
    	        },
    	        {
    	        	xtype: 'datefield',
    	            anchor: '100%',
    	            fieldLabel: '生日',
    	            format : 'Y-m-d',
    	            name: 'birthday',
    	            maxValue: new Date() 
    	        }
    	    ],
    	    buttons:[{
    	    	text:'提交',
    	    	handler:function(){
    	    		form.getForm().submit({
    	    			url:'/ttgl/userController/addUser.do',
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

