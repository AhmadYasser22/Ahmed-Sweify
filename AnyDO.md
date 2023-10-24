**Test Plan**

**Product:** Any.DO

**Date:** 2023-10-24

**Tester:** Ahmed Sweify

**Objectives:**

* Verify that users can register for and log in to app successfully.
* Verify that users can create, edit and delete tasks successfully.
* Verify that users can set reminders and receive notifications successfully.
* Verify that users can use app smoothly and log out successfullt.

**Scope:**

This test plan covers the following areas of Any.Do functionality:

* Registration and Login
* Task management
* Offline Functionalities
* App behavior and Logout

**Exclusions:**

The following areas of Any.DO functionality are not covered by this test plan:

* Multi-device support
* Business features

**Test Cases:**

**Registration and Login**

| Test Case ID | Test Case Description | Expected Result |
|---|---|---|
| TC01 | Verify successful and unsuccessful registration with valid and invalid/incomplete inputs respectively | User is able/unable to create an account |
| TC02 | Login with valid and invalid/missing credentials and verify successful login and error messages | User is able/unable to log in to their account |

**Task management**

| Test Case ID | Test Case Description | Expected Result |
|---|---|---|
| TC03 | Create one or more tasks with different inputs and verify their appearance in the task list | User is able to see created task/tasks in task list |
| TC04 | Edit an existing task and verify that the changes like making it done are saved and updated in task list | User is able to see updated task/tasks in task list or task details |
| TC05 | Delete one or more tasks and ensure they are removed from the task list | User is unable to see deleted task/tasks in task list  |
| TC06 | Add subtasks and notes to the tasks | All changes shall be saved |



**Offline Functionalities**

| Test Case ID | Test Case Description | Expected Result |
|---|---|---|
| TC07 | Set reminders for tasks and verify that notifications are received at the scheduled time | notifications are received at the scheduled time |
| TC08 | Verify offline task creation/editting/deleted ability | changes are synced once the device is back online|

*App Behavior and Logout**

| Test Case ID | Test Case Description | Expected Result |
|---|---|---|
| TC09 | Test app behavior when required permissions are accepted or denied | denied actions can't be completed |
| TC10 | Test app behavior with different orientations (portrait/landscape) | All functionalities and pages should be working with all orientation |
| TC11 | Test app stability against heavy usage like large number of tasks | app remains stable with accepted responsiveness |
| TC12 | Logout from logged in user | user should be logged out successfully |

**Execution:**

1. Register for an account.
2. Log in to your account.
3. Manage users Tasks.
4. Test app behvior under multiple circumstances

**Bugs:**
| Bug ID| Title | Bug Description | PreCondition | Steps | Expected Result | Actual Result | Severity | Priority|
|---|---|---|---|---|---|---|---|
| 1 | HomePage_OrientationError | when I navigate to homepage and switch to landscape view , app goes to my day instead of switching home view | 1.app installed 2.logged in user | 1.open app  2.press home icon  3.switch to landscape mode | HomePage remains and switches to landscape view | app switches to my day tab | Medium | Medium |

| 2 | HomePage_UxIssue | when I navigate to homepage , I expect to find settings button for various functionalites like sign out instead of being available in other tabs only | 1.app installed 2.logged in user | 1.open app  2.press home icon | Find Settings button in homepage | Settings button not found | Medium | Medium |

| 3 | App_UxIssue | when I open app, I expect homepage to be the default page not my day | 1.app installed 2.logged in user | 1.open app | Find Homepage | Find My Day page | Medium | Medium |

| 4 | RegistrationPage_UIError | when I open app registration page and click why do I need to create an account, It opened in the same window with grey color text which made it almost invisible | 1.app installed | 1.open app  2.press why do I need to create an account | new window is opened when button is clicked | same window with insuitable text color | Medium | Medium |

| 5 | GoogleRegistration_UIError | when I open google registration page , I expect to find close button incase I want to return back | 1.app installed | 1.open app  2.press continue with google | Find close button in the new window | No back or close button | Medium | Medium |

| 6 | OfflineAttachement_failure |when adding atachment to task offline fails, I expect that attachment uploading should be retried successfully after getting back online | 1.app installed 2.logged in user 3.user has created tasks| 1.open app 2.open my day 3.open existing task 4.try to upload image offline 5.save task
6.return online | upload to be successful once returned to online status  | upload failure | High | High |

**Conclusion:**

Testing is done
