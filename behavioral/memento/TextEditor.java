package behavioral.memento;

public class TextEditor {

    private StringBuilder text;

    public TextEditor() {
        this.text = new StringBuilder();
    }

    public void append(String text) {
        this.text.append(text);
    }

    public String getText() {
        return text.toString();
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(text.toString());
    }

    public void restore(TextEditorMemento memento) {
        this.text = new StringBuilder(memento.getText());
    }
}
