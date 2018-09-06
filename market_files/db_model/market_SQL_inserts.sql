-- -----------------------------------------------------
-- Table `market`.`roles`
-- -----------------------------------------------------
desc roles;

insert into roles
(name, description)
values
('Geremte','Gerente geral do market.');

select * from roles;

-- -----------------------------------------------------
-- Table `market`.`users`
-- -----------------------------------------------------
desc users;

insert into users
(id_role, name, login, password)
values
('1','Elias Ferreira','elias','elias12345');

select * from users;

-- -----------------------------------------------------
-- Table `market`.`categories`
-- -----------------------------------------------------
desc categories;

insert into categories
(name, description)
values
('Alcoólicos','Bebidas alcoólicas em geral.');

select * from categories;

-- -----------------------------------------------------
-- Table `market`.`products`
-- -----------------------------------------------------
desc products;

insert into products
(id_category, name, price, quantity)
values
('2','Detergent','1.25','20');

select * from products;

-- -----------------------------------------------------
-- Table `market`.`sales`
-- -----------------------------------------------------
desc sales;

insert into sales
(id_user, date, time)
values
('5','2018/06/07','16:02:05');

select * from sales;

-- -----------------------------------------------------
-- Table `market`.`carts`
-- -----------------------------------------------------
desc carts;

insert into carts
(id_sale, id_product, quantity)
values
('1','4','3');

select * from carts;