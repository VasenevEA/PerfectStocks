package mrv.perfect.stocks

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import android.app.PendingIntent
import androidx.core.view.accessibility.AccessibilityEventCompat.setAction
import android.content.Intent





class StocksWidgetProvider : AppWidgetProvider()
{

    override fun onUpdate(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)
        val widgetView = RemoteViews(context?.packageName, R.layout.widget_layout)
    }

}