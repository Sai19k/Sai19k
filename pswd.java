@Controller
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // Validate username and password (You might use a service to validate credentials)
        if (isValidCredentials(username, password)) {
            // If credentials are valid, redirect to the dashboard
            return "redirect:/dashboard";
        } else {
            // If credentials are invalid, show error message
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
    
    private boolean isValidCredentials(String username, String password) {
        // Logic to validate credentials (e.g., check against a database)
        // Return true if valid, false otherwise
        // This is a placeholder, actual validation depends on your implementation
        return username.equals("valid_username") && password.equals("valid_password");
    }
}

