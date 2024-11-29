 
CREATE TABLE customer_related_informations (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL, 
    CONSTRAINT fk_user_customer_related_information FOREIGN KEY (user_id) REFERENCES users (id)    
);