package com.example.jyothi.GWTExample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.smartgwt.client.data.DataSource;  
import com.smartgwt.client.types.FetchMode;  
import com.smartgwt.client.widgets.Canvas;  
import com.smartgwt.client.widgets.IButton;  
import com.smartgwt.client.widgets.grid.ListGrid;  

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTEx implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */

	/**
	 * This is the entry point method.
	 */
		    public void onModuleLoad() {  
		        final ListGrid listGrid = new ListGrid();  
		        listGrid.setWidth(900);  
		        listGrid.setHeight(224);  
		        listGrid.setAlternateRecordStyles(true);  
		        listGrid.setDataSource(DataSource.get("supplyItemHBAutoDerive"));  
		        listGrid.setCanEdit(true);  
		        listGrid.setCanRemoveRecords(true);  
		        listGrid.setDataFetchMode(FetchMode.LOCAL);  
		        listGrid.setAutoFetchData(true);  
		        listGrid.setUseAllDataSourceFields(true);  
		        listGrid.setShowFilterEditor(true);  
		  
		        IButton newButton = new IButton("Add New");  
		        
		  
		  
		    }  
}
