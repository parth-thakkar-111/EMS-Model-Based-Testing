// Generated by GraphWalker (http://www.graphwalker.org)
package com.ems2;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/ems2/test_25Aug_Evening.json")
public interface EMS_Tests {

    @Edge()
    void e_Login_with_valid_credentials();

    @Vertex()
    void v_Invalid_Leave_start_date_populated();

    @Edge()
    void e_View_leave_details_clicked();

    @Edge()
    void e_Logout();

    @Edge()
    void e_Enter_Reason_for_leave_again();

    @Vertex()
    void v_Reason_for_leave_entered();

    @Vertex()
    void v_Earned_leave_selected_again();

    @Edge()
    void e_Add_leave_details_clicked();

    @Vertex()
    void v_Attendance_page_opened();

    @Edge()
    void e_Enter_valid_Number_of_days_again();

    @Vertex()
    void v_Number_of_days_populated_again();

    @Vertex()
    void v_Number_of_days_populated();

    @Edge()
    void e_Click_on_Back_to_Employee_Details();

    @Vertex()
    void v_Attendance_Status_page_opened();

    @Vertex()
    void v_Employee_leave_details_displayed();

    @Vertex()
    void v_Leave_details_page_opened();

    @Edge()
    void e_Select_Earned_leave_for_Leave_category_again();

    @Vertex()
    void v_Earned_leave_selected();

    @Vertex()
    void v_Leave_approved_URL();

    @Edge()
    void e_Click_on_manage_employees();

    @Edge()
    void e_Enter_invalid_date_format();

    @Vertex()
    void v_Incorrect_password();

    @Vertex()
    void v_All_attendance_page_opened();

    @Edge()
    void e_Input_valid_username();

    @Vertex()
    void v_NonAdmin_details_entered();

    @Edge()
    void e_Click_on_view_leave_details_again();

    @Vertex()
    void v_Admin_logged_in();

    @Vertex()
    void v_You_did_not_enter_leave_in_correct_format_displayed();

    @Edge()
    void e_Input_incorrect_username();

    @Vertex()
    void v_Apply_leave_form_opened();

    @Edge()
    void e_Input_nonAdmin_credentials();

    @Edge()
    void e_Click_on_Approve_button();

    @Vertex()
    void v_NonAdmin_logged_in();

    @Vertex()
    void v_Valid_Leave_start_date_populated();

    @Edge()
    void e_Register_button_clicked_with_invalid_Start_date();

    @Vertex()
    void v_Submit_attendance();

    @Vertex()
    void v_Form_filled();

    @Vertex()
    void v_Reason_for_leave_entered_again();

    @Vertex()
    void v_Incorrect_username();

    @Vertex()
    void v_Add_leave_details_page_opened();

    @Edge()
    void e_Input_valid_password();

    @Vertex()
    void v_Personal_details_displayed();

    @Edge()
    void e_Navigate_back_to_Admin_page();

    @Edge()
    void e_Enter_Reason_for_leave();

    @Edge()
    void e_Input_incorrect_password();

    @Vertex()
    void v_Login_page_opened();

    @Edge()
    void e_Open_login_page();

    @Edge()
    void e_Set_leaves_for_all_employees();

    @Vertex()
    void v_You_have_successfully_applied_for_leave_displayed();

    @Edge()
    void e_NonAdmin_Logout();

    @Edge()
    void e_Click_on_Employee_Self_Service_Management();

    @Vertex()
    void v_Pending_leaves_displayed();

    @Edge()
    void e_Fill_form();

    @Edge()
    void e_Click_on_Apply_for_leave_button();

    @Edge()
    void e_View_employee_attendance_clicked();

    @Edge()
    void e_Click_sign_in_button();

    @Edge()
    void e_Register_button_clicked_with_valid_Start_date();

    @Edge()
    void e_Click_on_view_personal_details();

    @Edge()
    void e_Click_on_view_leave_details();

    @Edge()
    void e_Submit_button_clicked();

    @Edge()
    void e_Enter_valid_date_format();

    @Edge()
    void e_Click_on_View_pending_leaves();

    @Edge()
    void e_Click_on_Attendance_Status();

    @Edge()
    void e_Click_on_Attendance_from_personal_details_page();

    @Edge()
    void e_Select_Earned_leave_for_Leave_category();

    @Edge()
    void e_Click_on_Attendance_again();

    @Vertex()
    void v_Leaves_set_for_all_employees();

    @Edge()
    void e_Click_on_Attendance();

    @Edge()
    void e_Click_Submit();

    @Edge()
    void e_Enter_valid_Number_of_days();
}
