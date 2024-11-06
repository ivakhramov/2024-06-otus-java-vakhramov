--Набор DDL скриптов, создающих БД

CREATE DATABASE otus_java_basic_homework_lesson24;

CREATE TABLE public.tests
(
    id serial,
    name varchar(100) NOT NULL,
    description text NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.questions
(
    id serial,
    question text NOT NULL,
    test_id integer NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (test_id) REFERENCES public.tests(id) ON DELETE CASCADE
);

CREATE TABLE public.answers
(
    id serial,
    answer text NOT NULL,
    is_correct boolean NOT NULL,
    question_id integer NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (question_id) REFERENCES public.questions(id) ON DELETE CASCADE
);