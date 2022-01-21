package com.company.spring;

public class Books {
        private String name;
        private String author;

        public Books(String name, String author) {
            this.name = name;
            this.author = author;
        }

        public String toString() {
            return "{Название книги - '" + this.name + "', Автор  - '" + this.author + "'}";
        }

        public String getName() {
            return this.name;
        }

        public String getAuthor() {
            return this.author;
        }
    }


