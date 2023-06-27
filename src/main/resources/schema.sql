CREATE TABLE IF NOT EXISTS Content(
    id INTEGER AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    desc text,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP,
    date_updated TIMESTAMP,
    url VARCHAR(255),
    primary key(id)
);

INSERT INTO Content(title,desc,status,content_type,date_created)
VALUES('My Spring Datqa Blog Post','A post about spring','IDEA','ARTICLE',CURRENT_TIMESTAMP());