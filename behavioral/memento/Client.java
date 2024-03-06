package behavioral.memento;

public class Client {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        textEditor.append("Hello");
        history.saveState(textEditor.save());
        System.out.println(textEditor.getText());

        textEditor.append(" World");
        history.saveState(textEditor.save());
        System.out.println(textEditor.getText());

        textEditor.append("!");
        System.out.println(textEditor.getText());

        TextEditorMemento memento = history.restoreState();
        if(memento != null) {
            textEditor.restore(memento);
        }
        System.out.println(textEditor.getText());
    }
}

