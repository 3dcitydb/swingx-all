package org.jdesktop.swingx.combobox;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxEditor;

import org.jdesktop.swingx.JXTextField;

public class JXTextFieldComboBoxEditor implements ComboBoxEditor {
	private JXTextField textField;
	
	public JXTextFieldComboBoxEditor() {
		this(null);
	}
	
	public JXTextFieldComboBoxEditor(String promptText) {
		this(promptText, null);
	}
	
	public JXTextFieldComboBoxEditor(String promptText, Color promptForeground) {
		this(promptText, promptForeground, null);
	}

	public JXTextFieldComboBoxEditor(String promptText, Color promptForeground, Color promptBackground) {
		textField = new JXTextField(promptText, promptForeground, promptBackground);
		textField.setBorder(BorderFactory.createEmptyBorder());
		textField.setOuterMargin(new Insets(0, 2, 0, 2));
	}
	
	@Override
	public JXTextField getEditorComponent() {
		return textField;
	}

	@Override
	public void setItem(Object anObject) {
		textField.setText(anObject != null ? anObject.toString() : "");
	}

	@Override
	public Object getItem() {
		return textField.getText();
	}

	@Override
	public void selectAll() {
		textField.selectAll();
	}

	@Override
	public void addActionListener(ActionListener l) {
		textField.addActionListener(l);
	}

	@Override
	public void removeActionListener(ActionListener l) {
		textField.removeActionListener(l);
	}

}
