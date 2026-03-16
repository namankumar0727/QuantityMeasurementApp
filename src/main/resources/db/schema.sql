CREATE TABLE quantity_measurement (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    operation_type VARCHAR(50),
    measurement_type VARCHAR(50),
    value1 DOUBLE,
    value2 DOUBLE,
    result BOOLEAN,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);