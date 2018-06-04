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
- Click on button and if internet connection is available then it will go to  (http://erenutku.com) 



##To view Broadcast Widget:
- Go to MainActivity.java and try to find the comment
```
 /**
  * Broadcast Widget
  */
```
- Then uncomment `setContentView(R.layout.activity_main);`
- open `new_app_widget_info.xml` and find `android: configure` then remove that.
- Go to `NewAppWidgetReceiver.java` and find `onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)`
- just uncomment `updateBroadCastWidget(context, appWidgetManager, appWidgetId);`
- Now project is ready to show broadcast widget.
- clicking on button on widget it will increment the int value and broadcast value to widget.
- the logic for increment is written on `onReceive()`




  
         