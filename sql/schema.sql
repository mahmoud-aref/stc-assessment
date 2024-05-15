
--  table creation for testing the query

CREATE TABLE IF NOT EXISTS users
(
    user_id  INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    username VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS training_details
(
    user_training_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    user_id INT NOT NULL,
    training_id INT NOT NULL,
    training_date DATE NOT NULL
);

-- inserts

INSERT INTO users (username) VALUES ('John Doe');
INSERT INTO users (username) VALUES ('Jane Don');
INSERT INTO users (username) VALUES ('Alice Jones');
INSERT INTO users (username) VALUES ('Lisa Romero');

INSERT INTO training_details (user_id, training_id, training_date) VALUES (1, 1, '2015-08-02');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (2, 1, '2015-08-03');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (3, 2, '2015-08-02');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (4, 2, '2015-08-04');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (2, 2, '2015-08-03');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (1, 1, '2015-08-02');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (3, 2, '2015-08-04');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (4, 3, '2015-08-03');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (1, 4, '2015-08-03');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (3, 1, '2015-08-02');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (4, 2, '2015-08-04');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (3, 2, '2015-08-02');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (1, 1, '2015-08-02');
INSERT INTO training_details (user_id, training_id, training_date) VALUES (4, 3, '2015-08-03');