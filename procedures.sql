create procedure issue_enrollment_forms()
begin
    declare cur_applicant_id varchar(16);
    declare has_enrollment_form int default 0;
    declare end_of_table bool default false;

    declare record_pointer cursor for
        select applicant_id from applicant where status='LOCKED';

    declare continue handler for not found
    set end_of_table = true;

    open record_pointer;
         fetch record_pointer into cur_applicant_id;
        while end_of_table = false do
            select count(*) from enrollment_form where applicant_id=cur_applicant_id
            into has_enrollment_form;

            if has_enrollment_form = 0 then
                insert into enrollment_form(applicant_id,form,hsc_mark_sheet,entrance_mark_sheet)
                value (cur_applicant_id,'EMPTY','EMPTY','EMPTY');
            end if;

            fetch record_pointer into cur_applicant_id;
        end while;
    close record_pointer;
end;

