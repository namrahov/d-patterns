package memento;

public class MementoPatternMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Editing text
        editor.setContent("First draft");
        caretaker.addMemento(editor.save());
        System.out.println("Current content: " + editor.getContent());

        editor.setContent("Second draft");
        caretaker.addMemento(editor.save());
        System.out.println("Current content: " + editor.getContent());

        editor.setContent("Third draft");
        caretaker.addMemento(editor.save());
        System.out.println("Current content: " + editor.getContent());

        // Undo
        Memento memento = caretaker.undo();
        if (memento != null) {
            editor.restore(memento);
            System.out.println("ctrlZ " + editor.getContent());
        }

        // Redo
        memento = caretaker.redo();
        if (memento != null) {
            editor.restore(memento);
            System.out.println("ctrlY " + editor.getContent());
        }
    }
}