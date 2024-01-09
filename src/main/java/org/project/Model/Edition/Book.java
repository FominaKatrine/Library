package org.project.Model.Edition;

import java.util.List;

public class Book extends Edition {

    public Book(String title, String description, List<Person> authors, int year) {
        super(title, description, authors, year);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Book: " + this.getTitle() + ", author(s)= ");
        for (Person item : this.getAuthors()) {
            info.append(item.toString());
            info.append(", ");
        }
        info.append(" year: ");
        info.append(this.getYear());
        return info.toString();
    }

    @Override
    public String fullInfo() {
        StringBuilder info = new StringBuilder("Book:\n  Title: " + this.getTitle());
        info.append("\n  Description: ");
        info.append(this.getDescription());
        info.append("\n  Author(s): ");

        for (Person item : this.getAuthors()) {
            info.append(item.toString());
            info.append(", ");
        }
        info.append("\n  Year publisher: ");
        info.append(this.getYear());
        return info.toString();

    }


}
