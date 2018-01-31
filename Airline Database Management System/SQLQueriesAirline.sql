select * from Transactions;
select * from passengers;
select * from employee;
use airline;
select * from aircrafts;
select * from flight_schedule;
insert into flight_schedule(FlID, FlightDate, Departure, Arrival, afid, acid) values (5, '20-01-15 00:00:00' ,  '06:20:15' , '10:22:00' , 5, 4);
select * from transactions;
select * from transactionpassengerdetails;
insert into transactions(TsID, BookingDate, `Type` , FlID, ChID,diid , psid , empid ) values (5, '2017-02-12' , 1 , 1 , 2 , 3 , 5 ,2 );
select * from route;
select * from airfare;
insert into airfare(AfID, FareCurrency, FSCCurrency, RfID) values (4,90,10,4);
select * from charges;
select * from discounts;
update charges
set title = 'Urgent Cancellation' , Amount = 33.3 , description = '33.3% will be charged for cancellation for booking within 11 hrs from flight time'
where chId = 1;
update charges
set title = 'Excess Baggage' , Amount = 20.5 , description = '20.5 will be charged for Excess Baggage '
where chId = 2;
update discounts
set title = 'Prime Membership' , Amount = 5 , description = 'Prime MemberShip Gets You 5% Off'
where Diid = 1;
select * from chargesamount;
select * from discountamount;
call totalprice(1);
CREATE TABLE IF NOT EXISTS `airline`.`TransactionPassengerDetails` (
  `PassengerName` VARCHAR(45) NULL,
  `transactions_TsID` INT(11) NOT NULL,
  `EmployeeName` VARCHAR(45) NULL,
  `Psid` INT(11) NULL,
  `empID` INT(11) NULL,
  INDEX `fk_TransactionPassengerDetails_transactions1_idx` (`transactions_TsID` ASC),
  INDEX `fk_PsiD_idx` (`Psid` ASC),
  INDEX `fk_empID_idx` (`empID` ASC),
  CONSTRAINT `fk_TransactionPassengerDetails_transactions1`
    FOREIGN KEY (`transactions_TsID`)
    REFERENCES `airline`.`transactions` (`TsID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PsiD`
    FOREIGN KEY (`Psid`)
    REFERENCES `airline`.`passengers` (`PsID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_empID`
    FOREIGN KEY (`empID`)
    REFERENCES `airline`.`employee` (`EmpID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
select * from passengers;
select * from contact_details;
select *  from employee;

select * from passengerflightdetails;

