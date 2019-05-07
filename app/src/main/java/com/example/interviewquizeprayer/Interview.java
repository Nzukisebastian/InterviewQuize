package com.example.interviewquizeprayer;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class Interview extends Fragment {
    RecyclerView mRecyclerview;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mManager;
    List<Details> mListitems;
    ProgressBar progressBar;
    View v;
    public Interview(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.interview_fragment, container, false);
        mRecyclerview=(RecyclerView)v.findViewById(R.id.recyclerTemp);
        progressBar=(ProgressBar)v.findViewById(R.id.pb);
        mListitems=new ArrayList<>();
        mManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        mRecyclerview.setLayoutManager(mManager);
        mAdapter=new AdapterListdetails(mListitems,getActivity());
        mRecyclerview.setAdapter(mAdapter);
        request();
        return v;
    }

    private void request(){
        progressBar.setVisibility(View.VISIBLE);
        String qt1="So, the first question you’re probably going to get in an interview is, “Tell me about yourself.” Now, this is not an invitation to recite your entire life story or even to go bullet by bullet through your resume. Instead, it’s probably your first and best chance to pitch the hiring manager on why you’re the right one for the job.\n" +
                "\n" +
                "A formula I really like to use is called the Present-Past-Future formula. So, first you start with the present—where you are right now. Then, segue into the past—a little bit about the experiences you’ve had and the skills you gained at the previous position. Finally, finish with the future—why you are really excited for this particular opportunity.\n" +
                "\n" +
                "Let me give you an example:\n" +
                "\n" +
                "If someone asked, “tell me about yourself,” you could say:\n" +
                "\n" +
                "“Well, I’m currently an account executive at Smith, where I handle our top performing client. Before that, I worked at an agency where I was on three different major national healthcare brands. And while I really enjoyed the work that I did, I’d love the chance to dig in much deeper with one specific healthcare company, which is why I’m so excited about this opportunity with Metro Health Center.”\n" +
                "\n" +
                "Remember throughout your answer to focus on the experiences and skills that are going to be most relevant for the hiring manager when they’re thinking about this particular position and this company. And ultimately, don’t be afraid to relax a little bit, tell stories and anecdotes—the hiring manager already has your resume, so they also want to know a little more about you. ";

        String qt2="I know what you’re thinking. Nobody messes this interview question up, right? I mean, it’s the easiest one you’ll ever have to answer during your job hunt. Ever. When I was recruiting, I approached it with the mindset of, “I’m going to ask the candidate to tell me how he found the gig just to break the ice.” Or, I’m going to bring this up to know which of my many methods actually led to a qualified candidate sitting in front of me. Never was it ever a trick question.\n" +
                "\n" +
                "But I quickly learned that in a lot of ways, this one trips people up sometimes. And because I’ve seen some of the worst examples, here’s how you can avoid making the most common mistakes when talking about how you found the job.\n" +
                "\n" +
                "\n" +
                "1. You Feel Uneasy About Sharing That a Friend Referred You\n" +
                "\n" +
                "I get it. Nepotism, right? Yuck. Nobody wants to feel like he got his foot in the door just because he knows someone at the company. What's worse than getting a little help from a friend? Dancing around the answer, hoping that you won't have to fess up to the fact that not only is your future on the line, your friend currently has a referral fee on the table for getting you an interview.\n" +
                "\n" +
                "What to Do Instead\n" +
                "\n" +
                "I hate to sound so crass, but if you’re fortunate enough to know someone at a company you want to work for, just buckle up and tell everyone who asks you exactly how you found out about the job. A simple response like, “I was excited to find out about the job from my friend who works in [department]” is a perfectly OK response. In fact, it’s the only response you should be giving if this is the case.\n" +
                "\n" +
                "\n" +
                "2. You Turn it Into a Monologue About Why This Is the Only Job You Want\n" +
                "\n" +
                "Here's a perfect example of an interview question that only requires a short answer. All you need to do is tell the hiring manager where you found the darn job. But, all too often, candidates get so caught up in the moment that they end up turning it into a long-winded explanation of not only where they found the listing, but also why they couldn’t imagine working anywhere else. Sure, there’s nothing wrong with being excited about an opportunity, but when you’re going on and on about how you simple found the gig, it can be a huge turn-off for a recruiter.\n" +
                "\n" +
                "What to Do Instead\n" +
                "\n" +
                "If you want to fold in a little tidbit about why you’re so excited about the job, that’s not a terrible idea. But, keep it short. Add your unique spin to a response along the lines of, “I found it on [wherever you found the job], and since I’ve been hoping to work for the company for a long time, I was excited to see the opening had become available.” That’s all you need. Seriously.3. You Forgot Where You Found the Job\n" +
                "\n" +
                "Job searches are undeniably frustrating at times. I’ve had stretches where I had so many bills that I needed to pay, I applied for a lot of openings. And after a while, it can be hard to keep track of what you’ve applied for, what the positions call for, and where you found them in the first place. But that’s no excuse for drawing a complete blank when a hiring manager asks you how you stumbled onto the job that, let me remind you, that you are currently interviewing for.\n" +
                "\n" +
                "What to Do Instead\n" +
                "\n" +
                "When I realized that I had applied for a lot of jobs during my last stretch of unemployment, I made myself a simple Excel spreadsheet to keep track of everything. It included the following columns: job title, link to the original listing, the date I applied, where (or how) I found the opening, and current stage of the interview process. That list especially came in handy for phone interviews, but regardless of how close I was (or wasn’t) to getting any particular job, I don’t know how I could’ve kept track of anything during my job search without that spreadsheet. If you’re having trouble remembering little details, like how you found a particular posting, cobble together a tracker for yourself.\n" +
                "\n" +
                "\n" +
                "\n" +
                "If there’s one lesson to be learned, it’s that no interview question is too small to potentially mess up. And even the icebreakers can change the entire tone of a meeting with a hiring manager. So cross your T’s, build spreadsheets if you need to, and above anything else, answer the question as thoroughly and quickly as possible so you can focus on telling the interviewer more about why you’re the right fit for the job—rather than boring details about where you found it. ";

        String qt3="Any candidate can read and regurgitate the company’s “About” page. So, when interviewers ask this, they aren't necessarily trying to gauge whether you understand the mission—they want to know whether you care about it. Start with one line that shows you understand the company's goals, using a couple key words and phrases from the website, but then go on to make it personal. Say, “I’m personally drawn to this mission because…” or “I really believe in this approach because…” and share a personal example or two. ";
        String qt4="Again, companies want to hire people who are passionate about the job, so you should have a great answer about why you want the position. (And if you don't? You probably should apply elsewhere.) First, identify a couple of key factors that make the role a great fit for you (e.g., “I love customer support because I love the constant human interaction and the satisfaction that comes from helping someone solve a problem\"), then share why you love the company (e.g., “I’ve always been passionate about education, and I think you guys are doing great things, so I want to be a part of it”). ";
        String qt5="This interview question seems forward (not to mention intimidating!), but if you're asked it, you're in luck: There's no better setup for you to sell yourself and your skills to the hiring manager. Your job here is to craft an answer that covers three things: that you can not only do the work, you can deliver great results; that you'll really fit in with the team and culture; and that you'd be a better hire than any of the other candidates. ";
        String qt6="When answering this question, interview coach Pamela Skillings recommends being accurate (share your true strengths, not those you think the interviewer wants to hear); relevant (choose your strengths that are most targeted to this particular position); and specific (for example, instead of “people skills,” choose “persuasive communication” or “relationship building”). Then, follow up with an example of how you've demonstrated these traits in a professional setting.";
        String qt7="What your interviewer is really trying to do with this question—beyond identifying any major red flags—is to gauge your self-awareness and honesty. So, “I can't meet a deadline to save my life” is not an option—but neither is “Nothing! I'm perfect!” Strike a balance by thinking of something that you struggle with but that you’re working to improve. For example, maybe you’ve never been strong at public speaking, but you've recently volunteered to run meetings to help you be more comfortable when addressing a crowd. ";
       String qt8="Nothing says “hire me” better than a track record of achieving amazing results in past jobs, so don't be shy when answering this interview question! A great way to do so is by using the S-T-A-R method: Set up the situation and the task that you were required to complete to provide the interviewer with background context (e.g., “In my last job as a junior analyst, it was my role to manage the invoicing process”), but spend the bulk of your time describing what you actually did (the action) and what you achieved (the result). For example, “In one month, I streamlined the process, which saved my group 10 man-hours each month and reduced errors on invoices by 25%.” ";
       String qt9="In asking this behavioral interview question, “your interviewer wants to get a sense of how you will respond to conflict. Anyone can seem nice and pleasant in a job interview, but what will happen if you’re hired and Gladys in Compliance starts getting in your face?” says Skillings. Again, you'll want to use the S-T-A-R method, being sure to focus on how you handled the situation professionally and productively, and ideally closing with a happy ending, like how you came to a resolution or compromise. ";
       String qt10="If asked this question, be honest and specific about your future goals, but consider this: A hiring manager wants to know a) if you've set realistic expectations for your career, b) if you have ambition (a.k.a., this interview isn't the first time you're considering the question), and c) if the position aligns with your goals and growth. Your best bet is to think realistically about where this position could take you and answer along those lines. And if the position isn’t necessarily a one-way ticket to your aspirations? It’s OK to say that you’re not quite sure what the future holds, but that you see this experience playing an important role in helping you make that decision.";
       String qt11="Along similar lines, the interviewer wants to uncover whether this position is really in line with your ultimate career goals. While “an NBA star” might get you a few laughs, a better bet is to talk about your goals and ambitions—and why this job will get you closer to them. ";
       String qt12="Companies ask this for a number of reasons, from wanting to see what the competition is for you to sniffing out whether you're serious about the industry. “Often the best approach is to mention that you are exploring a number of other similar options in the company's industry,” says job search expert Alison Doyle. “It can be helpful to mention that a common characteristic of all the jobs you are applying to is the opportunity to apply some critical abilities and skills that you possess. For example, you might say 'I am applying for several positions with IT consulting firms where I can analyze client needs and translate them to development teams in order to find solutions to technology problems.'”";
       String qt13="This is a toughie, but one you can be sure you'll be asked. Definitely keep things positive—you have nothing to gain by being negative about your past employers. Instead, frame things in a way that shows that you're eager to take on new opportunities and that the role you’re interviewing for is a better fit for you than your current or last position. For example, “I’d really love to be part of product development from beginning to end, and I know I’d have that opportunity here.” And if you were let go? Keep it simple: “Unfortunately, I was let go,” is a totally OK answer. ";
       String qt14="OK, if you get the admittedly much tougher follow-up question as to why you were let go (and the truth isn't exactly pretty), your best bet is to be honest (the job-seeking world is small, after all). But it doesn't have to be a deal-breaker. Share how you’ve grown and how you approach your job and life now as a result. If you can position the learning experience as an advantage for this next job, even better.";
       String qt15="Hint: Ideally the same things that this position has to offer. Be specific.";
       String qt16="Hint: Ideally one that's similar to the environment of the company you're applying to. Be specific.";
       String qt17="The best managers are strong but flexible, and that's exactly what you want to show off in your answer. (Think something like, “While every situation and every team member requires a bit of a different strategy, I tend to approach my employee relationships as a coach...”) Then, share a couple of your best managerial moments, like when you grew your team from five to 15 or coached an underperforming employee to become the company's top salesperson. ";
       String qt18="Depending on what's more important for the the role, you'll want to choose an example that showcases your project management skills (spearheading a project from end to end, juggling multiple moving parts) or one that shows your ability to confidently and effectively rally a team. And remember: “The best stories include enough detail to be believable and memorable,” says Skillings. “Show how you were a leader in this situation and how it represents your overall leadership experience and potential.”";
       String qt19="Everyone disagrees with the boss from time to time, but in asking this interview question, hiring managers want to know that you can do so in a productive, professional way. “You don’t want to tell the story about the time when you disagreed but your boss was being a jerk and you just gave in to keep the peace. And you don’t want to tell the one where you realized you were wrong,” says Peggy McKee of Career Confidential. “Tell the one where your actions made a positive difference on the outcome of the situation, whether it was a work-related outcome or a more effective and productive working relationship.”";
       String qt20="First of all, be honest (remember, if you get this job, the hiring manager will be calling your former bosses and co-workers!). Then, try to pull out strengths and traits you haven't discussed in other aspects of the interview, such as your strong work ethic or your willingness to pitch in on other projects when needed.";
       String qt21="If you were unemployed for a period of time, be direct and to the point about what you’ve been up to (and hopefully, that’s a litany of impressive volunteer and other mind-enriching activities, like blogging or taking classes). Then, steer the conversation toward how you will do the job and contribute to the organization: “I decided to take a break at the time, but today I’m ready to contribute to this organization in the following ways.”";
      String qt22="Don't be thrown off by this question—just take a deep breath and explain to the hiring manager why you've made the career decisions you have. More importantly, give a few examples of how your past experience is transferrable to the new role. This doesn't have to be a direct connection; in fact, it's often more impressive when a candidate can make seemingly irrelevant experience seem very relevant to the role. ";
      String qt23="\"Choose an answer that shows that you can meet a stressful situation head-on in a productive, positive manner and let nothing stop you from accomplishing your goals,\" says McKee. A great approach is to talk through your go-to stress-reduction tactics (making the world's greatest to-do list, stopping to take 10 deep breaths), and then share an example of a stressful situation you navigated with ease.";
      String qt24="Start by explaining what you'd need to do to get ramped up. What information would you need? What parts of the company would you need to familiarize yourself with? What other employees would you want to sit down with? Next, choose a couple of areas where you think you can make meaningful contributions right away. (e.g., “I think a great starter project would be diving into your email marketing campaigns and setting up a tracking system for them.”) Sure, if you get the job, you (or your new employer) might decide there’s a better starting place, but having an answer prepared will show the interviewer where you can add immediate impact—and that you’re excited to get started.";
      String qt25="The #1 rule of answering this question is doing your research on what you should be paid by using sites like Payscale and Glassdoor. You’ll likely come up with a range, and we recommend stating the highest number in that range that applies, based on your experience, education, and skills. Then, make sure the hiring manager knows that you're flexible. You're communicating that you know your skills are valuable, but that you want the job and are willing to negotiate.";
     String qt26="Interviewers ask personal questions in an interview to “see if candidates will fit in with the culture [and] give them the opportunity to open up and display their personality, too,” says longtime hiring manager Mitch Fortner. “In other words, if someone asks about your hobbies outside of work, it’s totally OK to open up and share what really makes you tick. (Do keep it semi-professional, though: Saying you like to have a few beers at the local hot spot on Saturday night is fine. Telling them that Monday is usually a rough day for you because you’re always hungover is not.)”";
     String qt27="Seemingly random personality-test type questions like these come up in interviews generally because hiring managers want to see how you can think on your feet. There's no wrong answer here, but you'll immediately gain bonus points if your answer helps you share your strengths or personality or connect with the hiring manager. Pro tip: Come up with a stalling tactic to buy yourself some thinking time, such as saying, “Now, that is a great question. I think I would have to say… ” ";
    String qt28=" Hiring managers want to know that you not only have some background on the company, but that you're able to think critically about it and come to the table with new ideas. So, come with new ideas! What new features would you love to see? How could the company increase conversions? How could customer service be improved? You don’t need to have the company’s four-year strategy figured out, but do share your thoughts, and more importantly, show how your interests and expertise would lend themselves to the job. ";
    String qt29="You probably already know that an interview isn't just a chance for a hiring manager to grill you—it's your opportunity to sniff out whether a job is the right fit for you. What do you want to know about the position? The company? The department? The team?\n" +
            "\n" +
            "You'll cover a lot of this in the actual interview, so have a few less-common questions ready to go. We especially like questions targeted to the interviewer (“What's your favorite part about working here?\") or the company's growth (“What can you tell me about your new products or plans for growth?\")";
     //mListitems=new ArrayList<>();
        // model.setTitle(data.getString("title"));
        mListitems.add(new Details("1. Can you tell me a little about yourself?",qt1));
        mListitems.add(new Details("2. How did you hear about the position?",qt2));
        mListitems.add(new Details("3. What do you know about the company?",qt3));
        mListitems.add(new Details("4. Why do you want this job?",qt4));
        mListitems.add(new Details("5. Why should we hire you?",qt5));
        mListitems.add(new Details("6. What are your greatest professional strengths?",qt6));
        mListitems.add(new Details("7. What do you consider to be your weaknesses?",qt7));
        mListitems.add(new Details("8. What is your greatest professional achievement?",qt8));
        mListitems.add(new Details("9. Tell me about a challenge or conflict you've faced at work, and how you dealt with it.",qt9));
        mListitems.add(new Details("10. Where do you see yourself in five years?",qt10));
        mListitems.add(new Details("11. What's your dream job?",qt11));
        mListitems.add(new Details("12. What other companies are you interviewing with?",qt12));
        mListitems.add(new Details("13. Why are you leaving your current job?",qt13));
        mListitems.add(new Details("14. Why were you fired?",qt14));
        mListitems.add(new Details("15. What are you looking for in a new position?",qt15));
        mListitems.add(new Details("16. What type of work environment do you prefer?",qt16));
        mListitems.add(new Details("17. What's your management style?",qt17));
        mListitems.add(new Details("18. What's a time you exercised leadership?",qt18));
        mListitems.add(new Details("19. What's a time you disagreed with a decision that was made at work?",qt19));
        mListitems.add(new Details("20. How would your boss and co-workers describe you?",qt20));
        mListitems.add(new Details("21. Why was there a gap in your employment?",qt21));
        mListitems.add(new Details("22. Can you explain why you changed career paths?",qt22));
        mListitems.add(new Details("23. How do you deal with pressure or stressful situations?",qt23));
        mListitems.add(new Details("24. What would your first 30, 60, or 90 days look like in this role?",qt24));
        mListitems.add(new Details("25. What are your salary requirements?",qt25));
        mListitems.add(new Details("26. What do you like to do outside of work?",qt26));
        mListitems.add(new Details("27. If you were an animal, which one would you want to be?",qt27));
        mListitems.add(new Details("28. What do you think we could do better or differently?",qt28));
        mListitems.add(new Details("29. Do you have any questions for us?",qt29));

        progressBar.setVisibility(View.GONE);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }
}
