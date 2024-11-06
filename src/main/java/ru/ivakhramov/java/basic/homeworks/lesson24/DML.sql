--Набор DML скриптов, для наполнения и выборки из созданной БД

INSERT INTO public.tests (test_name, description) VALUES
    ('Имя теста №1', 'Описание теста №1'),
    ('Имя теста №2', 'Описание теста №2'),
    ('Имя теста №3', 'Описание теста №3');

INSERT INTO public.questions (question, id_test) VALUES
    ('Вопрос №1 теста №1', 1),
    ('Вопрос №2 теста №1', 1),
    ('Вопрос №3 теста №1', 1),
    ('Вопрос №1 теста №2', 2),
    ('Вопрос №2 теста №2', 2),
    ('Вопрос №3 теста №2', 2),
    ('Вопрос №1 теста №3', 3),
    ('Вопрос №2 теста №3', 3),
    ('Вопрос №3 теста №3', 3);

INSERT INTO public.answers (answer, is_correct, id_question) VALUES
    ('Вариант ответа №1 вопроса №1 теста №1', false,1),
    ('Вариант ответа №2 вопроса №1 теста №1', true,1),
    ('Вариант ответа №3 вопроса №1 теста №1', false,1),
    ('Вариант ответа №1 вопроса №2 теста №1', false,1),
    ('Вариант ответа №2 вопроса №2 теста №1', true,1),
    ('Вариант ответа №3 вопроса №2 теста №1', false,1),
    ('Вариант ответа №1 вопроса №3 теста №1', false,1),
    ('Вариант ответа №2 вопроса №3 теста №1', true,1),
    ('Вариант ответа №3 вопроса №3 теста №1', false,1),
    ('Вариант ответа №1 вопроса №1 теста №2', false,2),
    ('Вариант ответа №2 вопроса №1 теста №2', true,2),
    ('Вариант ответа №3 вопроса №1 теста №2', false,2),
    ('Вариант ответа №1 вопроса №2 теста №2', false,2),
    ('Вариант ответа №2 вопроса №2 теста №2', true,2),
    ('Вариант ответа №3 вопроса №2 теста №2', false,2),
    ('Вариант ответа №1 вопроса №3 теста №2', false,2),
    ('Вариант ответа №2 вопроса №3 теста №2', true,2),
    ('Вариант ответа №3 вопроса №3 теста №2', false,2),
    ('Вариант ответа №1 вопроса №1 теста №3', false,3),
    ('Вариант ответа №2 вопроса №1 теста №3', true,3),
    ('Вариант ответа №3 вопроса №1 теста №3', false,3),
    ('Вариант ответа №1 вопроса №2 теста №3', false,3),
    ('Вариант ответа №2 вопроса №2 теста №3', true,3),
    ('Вариант ответа №3 вопроса №2 теста №3', false,3),
    ('Вариант ответа №1 вопроса №3 теста №3', false,3),
    ('Вариант ответа №2 вопроса №3 теста №3', true,3),
    ('Вариант ответа №3 вопроса №3 теста №3', false,3);

SELECT * FROM tests;

SELECT * FROM questions;

SELECT * FROM answers;
