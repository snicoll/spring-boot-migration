CREATE TABLE speaker (
  id         BIGINT auto_increment,
  first_name VARCHAR(100),
  last_name  VARCHAR(30),
  twitter    VARCHAR(30),
  github     VARCHAR(30),
  bio        TEXT,
  PRIMARY KEY (id)
);