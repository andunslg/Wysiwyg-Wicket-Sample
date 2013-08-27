/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wicket.jquery.ui.plugins.wysiwyg.sample.toolbar;

import com.googlecode.wicket.jquery.core.IJQueryWidget.JQueryWidget;
import com.googlecode.wicket.jquery.ui.plugins.emoticons.EmoticonsBehavior;
import com.googlecode.wicket.jquery.ui.plugins.wysiwyg.toolbar.IWysiwygToolbar;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.ResourceModel;

import java.util.Locale;

/**
 * Provides a custom implementation for {@link com.googlecode.wicket.jquery.ui.plugins.wysiwyg.toolbar.IWysiwygToolbar}
 *
 * @author andunslg
 */
public class ChatToolbar extends Panel implements IWysiwygToolbar
{
	private static final long serialVersionUID = 1L;
	private final WebMarkupContainer toolbar;

	/**
	 * Constructor
	 *
	 * @param id the markup-id
	 */
	public ChatToolbar(String id)
	{
		this(id, null);
	}

	/**
	 * Constructor
	 *
	 * @param id the markup-id
	 * @param model the {@link org.apache.wicket.model.IModel}
	 */
	public ChatToolbar(String id, IModel<String> model)
	{
		super(id,model);

		this.toolbar = new WebMarkupContainer("toolbar");
		this.toolbar.setMarkupId("bToolbar");

		toolbar.add(new EmoticonsBehavior("."+"emt"));
		this.add(this.toolbar);


	}

	@Override
	public void attachToEditor(Component editor)
	{
		this.toolbar.add(AttributeModifier.replace("data-target",JQueryWidget.getSelector(editor)));
	}
}

