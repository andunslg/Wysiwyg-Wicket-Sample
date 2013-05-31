package com.googlecode.wicket.jquery.ui.plugins.wysiwyg.sample;

import com.googlecode.wicket.jquery.ui.WysiwygEditor;
import com.googlecode.wicket.jquery.ui.WysiwygText;
import com.googlecode.wicket.jquery.ui.plugins.wysiwyg.WysiwygBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class HomePage extends WebPage{
	private static final long serialVersionUID=1L;

	public HomePage(final PageParameters parameters){
		super(parameters);

		final WysiwygEditor wysiwygEditor=new WysiwygEditor("container",new Model<WysiwygText>());

		Form form=null;
		add(form=new Form("form"){
			@Override
			protected void onSubmit(){
				WysiwygText wysiwygText=(WysiwygText)wysiwygEditor.getDefaultModelObject();
				info(wysiwygText.getText());
			}
		});
		form.add(wysiwygEditor);
		this.add(new WysiwygBehavior("#editorArea","wysiwyg"));
//		this.add(new WysiwygEditor("buttonPanel","editorArea"));

	}
}
