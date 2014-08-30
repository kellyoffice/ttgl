Ext.define('MyApp.MyPanel', {
     extend      : 'Ext.Panel',
     width       : 200,
     height      : 150,
     bodyPadding : 5
 });

Ext.application({
    name   : 'MyApp',

    launch : function() {

       Ext.create('Ext.Panel', {
            renderTo     : Ext.getBody(),
            width        : 200,
            height       : 150,
            bodyPadding  : 5,
            title        : 'Hello World',
            html         : 'Hello <b>World</b>...'
        });

       Ext.create('MyApp.MyPanel', {
           renderTo :Ext.getBody(),
           title    : 'My First Panel',
           html     : 'My First Panel'
       });

       Ext.create('MyApp.MyPanel', {
           renderTo : Ext.getBody(),
           title    : 'My Second Panel',
           html     : 'My Second Panel'
       });
       
       Ext.widget({
           renderTo : Ext.getBody(),
           xtype    : 'grid',
           title    : 'Grid',
           width    : 650,
           height   : 300,
           plugins  : 'rowediting',
           store    : {
               fields : [ 'name', 'age', 'votes', 'credits' ],
               data   : [
                   [ 'Bill', 35, 10, 427 ],
                   [ 'Fred', 22, 4, 42 ]
               ]
           },
           columns: {
               defaults: {
                   editor : 'numberfield',
                   width  : 120
               },
               items: [
                   { text: 'Name', dataIndex: 'name', flex: 1, editor: 'textfield' },
                   { text: 'Age', dataIndex: 'age' },
                   { text: 'Votes', dataIndex: 'votes' },
                   { text: 'Credits', dataIndex: 'credits' }
               ]
           }
       });
       
       Ext.create('Ext.tab.Panel', {
           renderTo: Ext.getBody(),
           height: 100,
           width: 200,
           items: [
               {
                   // Explicitly define the xtype of this Component configuration.
                   // This tells the Container (the tab panel in this case)
                   // to instantiate a Ext.panel.Panel when it deems necessary
                   xtype: 'panel',
                   title: 'Tab One',
                   html: 'The first tab',
                   listeners: {
                       render: function() {
                           Ext.MessageBox.alert('Rendered One', 'Tab One was rendered.');
                       }
                   }
               },
               {
                   // xtype for all Component configurations in a Container
                   title: 'Tab Two',
                   html: 'The second tab',
                   listeners: {
                       render: function() {
                           Ext.MessageBox.alert('Rendered One', 'Tab Two was rendered.');
                       }
                   }
               }
           ]
       });
       
       var panel = Ext.create('Ext.panel.Panel', {
    	    width: 200,
    	    height: 100,
    	    floating: true, // make this panel an absolutely-positioned floating component
    	    title: 'Test',
    	    html: 'Test Panel',
    	    draggable:true
    	});
       panel.show();
       
      
    }
});

