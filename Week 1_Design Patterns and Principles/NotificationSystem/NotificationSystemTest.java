public class NotificationSystemTest {
    public static void main(String[] args) {
        // Basic Email Notification
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello!");

        System.out.println("----");

        // Email + SMS Notification
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Hello!");

        System.out.println("----");

        // Email + SMS + Slack Notification
        Notifier slackNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        slackNotifier.send("Hello!");
    }
}
