CREATE TABLE 'students' (
    `student_no` int (3) NOT NULL auto_increment,
    `student_name` varchar(30)  NOT NULL,
    'student_dob' datetime default NULL,
    'student_doj' datetime default NULL,
    PRIMARY KEY ('student_no')
);
