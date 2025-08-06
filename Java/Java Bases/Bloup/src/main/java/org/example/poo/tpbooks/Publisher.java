package org.example.poo.tpbooks;

public class Publisher {
    int idPublisher;
    int counter = 0;
    String publisherName;


    public Publisher() {

    }

    {
        counter++;
    }

    public Publisher(int idPublisher, String publisherName) {
        this.idPublisher = idPublisher;
        this.publisherName = publisherName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "idPublisher=" + idPublisher +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}
