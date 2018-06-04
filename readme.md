#ACK


##To view Simple Widget:
- Go to MainActivity.java and try to find the comment
```
 /**
  * Simple Widget
  */
```
- Then uncomment `setContentView(R.layout.activity_main);`
- open `new_app_widget_info.xml` and find `android: configure` then remove that.
- Go to `NewAppWidgetReceiver.java` and find `onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)`
- just uncomment `updateSimpleWidget(context, appWidgetManager, appWidgetId);`
- Now project is ready to show simple widget.
- Run project and then find the widget from widgets's list.



  
         