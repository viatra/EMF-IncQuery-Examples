# EMFxcel: using Eclipse Modeling to extend the power and usefulness of Excel spreadsheets

In order to be able to do advanced data processing and visualization with technologies I am familiar with, I created a simple tool to process Microsoft Excel® documents using Eclipse Modeling. The solution consists of an Xcore-based Excel domain, and a slightly modified EMF generated editor that is able to open Excel files directly as EMF instance models via Apache POI, and automatically track and propagate changes as the opened file is being simultaneously modified in Excel. I demonstrate live data processing using EMF-IncQuery graph queries, and live data visualization using IncQuery Viewers.

See https://incquery.net/incquery/examples/emfxcel for the detailed documentation.


Excel is a registered trademark of Microsoft.

This example embeds the Apache POI Library in accordance with the Apache License 2.0
http://poi.apache.org
http://www.apache.org/licenses/

All other original content licensed under the Eclipse Public License 1.0
http://www.eclipse.org/legal/epl-v10.html
