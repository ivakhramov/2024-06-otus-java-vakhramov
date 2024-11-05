--Набор DDL скриптов, создающих БД

CREATE DATABASE otus_java_basic_homework_lesson24;

CREATE TABLE public.tests
(
    id serial NOT NULL,
    test_name varchar(100) NOT NULL,
    description text NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.questions
(
    id serial NOT NULL,
    question text NOT NULL,
    id_test integer NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_test) REFERENCES public.tests(id) ON DELETE CASCADE
);

CREATE TABLE public.answers
(
    id serial NOT NULL,
    answer text NOT NULL,
    is_correct boolean NOT NULL,
    id_question integer NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_question) REFERENCES public.questions(id) ON DELETE CASCADE
);